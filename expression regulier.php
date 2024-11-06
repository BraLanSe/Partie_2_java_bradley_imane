<?php
$title = "Exercice 8";
require "debut_code_html.php";


function check_er($regex, $tests) {
    $errors = 0;
    foreach ($tests as $string => $expected) {
        $matches = preg_match($regex, $string);
        if ($matches && !$expected) {
            echo "ERREUR : \"$string\" vérifie l'expression alors que la valeur est false !<br>";
            $errors++;
        } elseif (!$matches && $expected) {
            echo "ERREUR : \"$string\" ne vérifie pas l'expression alors que la valeur est true !<br>";
            $errors++;
        }
    }
    echo "$errors erreurs !<br>";
}

// Exemples d'utilisation
$int_regex = '/^-?\d+$/';
check_er($int_regex, [
    "10" => true,
    "0" => true,
    "-34539" => true,
    "--44" => false,
    "" => false,
    "123a456" => false,
    "10.2" => false
]);

$decimal_regex = '/^-?\d+\.\d+$/';
check_er($decimal_regex, [
    "10" => true,
    "0" => true,
    "-34539" => true,
    "--44" => false,
    "" => false,
    "123a456" => false,
    "10.2" => true,
    "0.001" => true,
    ".001" => true,
    "10." => false
]);

$date_regex = '/^(0?[1-9]|[12][0-9]|3[01])\/(0?[1-9]|1[0-2])\/\d{4}$/';
check_er($date_regex, [
    "10/10/2021" => true,
    "9/9/1234" => true,
    "90/9/5476" => true,
    "8/23/0014" => true,
    "111/23/0423" => false,
    "12/12/123" => false,
    "1/11234" => false,
    "10/2" => false,
    "1a/2b/8790" => false
]);

require "fin_code_html.php";
?>