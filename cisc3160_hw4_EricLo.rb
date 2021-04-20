array_for_bubble_sort = [4, 2, 1, 3]
array_for_selection_sort = [4, 2, 1, 3]

#bubble sort
length_of_array_for_bubble_sort = array_for_bubble_sort.length()

(0..(length_of_array_for_bubble_sort-1)).each do |i|
   (0..(length_of_array_for_bubble_sort-i-2)).each do |j|
     if array_for_bubble_sort[j] > array_for_bubble_sort[j+1]
       temp = array_for_bubble_sort[j]
       array_for_bubble_sort[j] = array_for_bubble_sort[j+1]
       array_for_bubble_sort[j+1] = temp
     end
    end
end
puts "#{array_for_bubble_sort}"

#selection sort
length_of_array_for_selection_sort = array_for_selection_sort.length()

(0..(length_of_array_for_selection_sort-1)).each do |i|
  x = i
  ((i+1)..(length_of_array_for_selection_sort-1)).each do |j|
    if array_for_selection_sort[x] > array_for_selection_sort[j]
      x = j
    end
  end
  temp = array_for_selection_sort[i]
  array_for_selection_sort[i] = array_for_selection_sort[x]
  array_for_selection_sort[x] = temp
end
puts "#{array_for_selection_sort}"
