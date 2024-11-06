<?php
$title = "Exercice 2";
require "debut_code_html.php";

$chats = 3;
$chiens = 2;

// Utilisation d'apostrophes
echo '<p>J’ai ' . $chats . ' chats et ' . $chiens . ' chiens, ce qui me fait ' . ($chats + $chiens) . ' animaux.</p>';

// Utilisation de guillemets
echo "<p>J’ai $chats chats et $chiens chiens, ce qui me fait " . ($chats + $chiens) . " animaux.</p>";

require "fin_code_html.php";
?>