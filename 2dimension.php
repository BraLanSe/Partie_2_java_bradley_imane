<?php
$title = "Exercice 6";
require "debut_code_html.php";


$tabMagazines = [
    'le monde'              => ['frequence' => 'quotidien', 'type' => 'actualité', 'prix' => 220],
    'le point'              => ['frequence' => 'hebdo'    , 'type' => 'actualité', 'prix' => 80 ],
    'causette'              => ['frequence' => 'mensuel'  , 'type' => 'féminin'  , 'prix' => 180],
    'politis'               => ['frequence' => 'hebdo'    , 'type' => 'opinion'  , 'prix' => 100],
    'le monde diplomatique' => ['frequence' => 'mensuel'  , 'type' => 'analyse'  , 'prix' => 60 ],
    'libération'            => ['frequence' => 'quotidien', 'type' => 'actualité', 'prix' => 190],
  ];
  
  $tabMagazinesAbonne = ['le monde', 'le monde diplomatique'];


  $magazines_keys = array_keys($tabMagazines);
  sort($magazines_keys);
  echo implode(', ', $magazines_keys);

  
  $quotidiens = [];
  foreach ($tabMagazines as $nom => $details) {
      if ($details['frequence'] === 'quotidien') {
          $quotidiens[] = $nom;
      }
  }
  echo implode(', ', $quotidiens);
  
  
  foreach ($tabMagazines as $nom => $details) {
      echo "$nom ({$details['frequence']}, {$details['type']}, {$details['prix']})<br>";
  }
  
  
  $total_prix = 0;
  foreach ($tabMagazinesAbonne as $magazine) {
      $total_prix += $tabMagazines[$magazine]['prix'];
  }
  echo "Prix total de l'abonnement : $total_prix";

require_once "fin_code_html.php";
?>