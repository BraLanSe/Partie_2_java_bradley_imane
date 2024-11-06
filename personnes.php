<?php
$title = "Exercice 5";
require "debut_code_html.php";


$personnes = [
    ['Joueur' => 'Camille'  , 'score' => 156 ],
    ['Joueur' => 'Guillaume', 'score' => 254 ],
    ['Joueur' => 'Julien'   , 'score' => 192 ],
    ['Joueur' => 'Nabila'   , 'score' => 317 ],
    ['Joueur' => 'Lorianne' , 'score' => 235 ],
    ['Joueur' => 'Tom'      , 'score' => 83  ],
    ['Joueur' => 'Michael'  , 'score' => 325 ],
    ['Joueur' => 'Eddy'     , 'score' => 299 ]
  ];
function afficherTable($tableau) {
    echo "<table border='1'>";
    echo "<tr>";
    // En-têtes
    foreach (array_keys($tableau[array_keys($tableau)[0]]) as $header) {
        echo "<th>$header</th>";
    }
    echo "</tr>";

    // Lignes
    foreach ($tableau as $ligne) {
        echo "<tr>";
        foreach ($ligne as $cellule) {
            echo "<td>$cellule</td>";
        }
        echo "</tr>";
    }
    echo "</table>";
}

afficherTable($personnes);
require "fin_code_html.php";
?>