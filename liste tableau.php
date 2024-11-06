<?php
$title = "Exercice 4";
require "debut_code_html.php";

$t = [
    'english',
    'first'=>'html', 
    2 => 'css', 
    'best'=>'php', 
    'javascript',
    5 => 'jQuery'
];

echo "<ol>";
foreach ($t as $value) {
    echo "<li>$value</li>";
}
echo "</ol>";
echo "<ol>";
foreach (array_keys($t) as $key) {
    echo "<li>$key</li>";
}
echo "</ol>";

require "fin_code_html.php";
?>