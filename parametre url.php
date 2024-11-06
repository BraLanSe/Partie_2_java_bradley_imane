<?php
$title = "Exercice 9";
require "debut_code_html.php";


if (isset($_GET['nombre'])) {
    $nombre = $_GET['nombre'];
    if (preg_match('/^-?\d+$/', $nombre)) {
        echo "$nombre est un nombre entier.<br>";
    } else {
        echo "$nombre n'est pas un nombre entier.<br>";
    }
}
?>

<form method="GET" action="">
    <input type="text" name="nombre" placeholder="Entrez un nombre">
    <button type="submit">Vérifier</button>
</form>

