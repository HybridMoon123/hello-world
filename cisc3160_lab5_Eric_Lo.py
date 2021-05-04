def add_it_up(user_input_number):#function add 0 to x
    add_from_zero_to_number = 0
    while user_input_number>=0:
        add_from_zero_to_number = add_from_zero_to_number + user_input_number
        user_input_number = user_input_number - 1
    print(add_from_zero_to_number)#output
    
user_input_number = input("integer: ")#user input
user_input_number = int(user_input_number)
add_it_up(user_input_number)
