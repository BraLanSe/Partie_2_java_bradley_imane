<?php
$title = "Exercice 7";
require "debut_code_html.php";

class TODOList {
    private $to_dos;

    public function __construct() {
        $this->to_dos = [];
    }

    public function add_to_do($task) {
        if (!empty(trim($task))) {
            $this->to_dos[] = $task;
        }
    }

    public function remove_to_do($index) {
        if (isset($this->to_dos[$index])) {
            unset($this->to_dos[$index]);
            $this->to_dos = array_values($this->to_dos); // Reindexer
        }
    }

    public function is_empty() {
        return empty($this->to_dos);
    }

    public function get_html() {
        if ($this->is_empty()) {
            return "<p>Aucune tâche à faire !</p>";
        }
        $html = "<ul>";
        foreach ($this->to_dos as $index => $task) {
            $html .= "<li><a href='tdl.php?rm=$index'>$task</a></li>";
        }
        $html .= "</ul>";
        return $html;
    }

    public function get_representation() {
        return implode("///", $this->to_dos);
    }

    public function set_representation($representation) {
        $this->to_dos = explode("///", $representation);
    }
}


$todoList = new TODOList();
$todoList->add_to_do("Tâche 1");
$todoList->add_to_do("Tâche 2");
$todoList->add_to_do("  "); // Ne doit pas être ajoutée
$todoList->add_to_do("Tâche 3");

echo $todoList->get_html(); // Affiche les tâches

$todoList->remove_to_do(1); // Supprime "Tâche 2"

echo $todoList->get_html(); // Affiche les tâches après suppression

echo $todoList->is_empty() ? "La liste est vide." : "Il y a des tâches.";

require "fin_code_html.php";
?>