<?php
$array_for_bubble_sort = array(4, 2, 1, 3);
$array_for_selection_sort = array(4, 2, 1, 3);

#bubble sort
$length_of_array_for_bubble_sort = count($array_for_bubble_sort);
for ($i = 0; $i <= ($length_of_array_for_bubble_sort-1); $i++) {
  for ($j = 0; $j <= ($length_of_array_for_bubble_sort-i-2); $j++) {
    if ($array_for_bubble_sort[$j] > $array_for_bubble_sort[$j+1]) {
      $temp = $array_for_bubble_sort[$j];
      $array_for_bubble_sort[$j] = $array_for_bubble_sort[$j+1];
      $array_for_bubble_sort[$j+1] = $temp;
    }
  }
}
echo "$array_for_bubble_sort[0], $array_for_bubble_sort[1], $array_for_bubble_sort[2], $array_for_bubble_sort[3] <br>";

#selection sort
$length_of_array_for_selection_sort = count($array_for_selection_sort);
for ($i = 0; $i <= ($length_of_array_for_selection_sort-1); $i++) {
  $x = $i;
  for ($j = ($i+1); $j <= ($length_of_array_for_selection_sort-1); $j++) {
    if ($array_for_selection_sort[$x] > $array_for_selection_sort[$j]) {
      $x = $j;
    }
  }
  $temp = $array_for_selection_sort[$i];
  $array_for_selection_sort[$i] = $array_for_selection_sort[$x];
  $array_for_selection_sort[$x] = $temp;
}
echo "$array_for_selection_sort[0], $array_for_selection_sort[1], $array_for_selection_sort[2], $array_for_selection_sort[3]";
?>
