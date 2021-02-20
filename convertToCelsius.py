def convertToCelsius(fahrenheit):    #fahrenheit convert to celsius
    celsius = 0.0
    celsius = (float(fahrenheit) - 32) * 5 / 9
    return str(round(celsius, 1))

arrayForFahrenheit=[]
for i in range(1, 8):   #user input fahrenheit for 7 days
    userInputFahrenheit = input("Day " + str(i) + " Fahrenheit: ")
    arrayForFahrenheit.append(userInputFahrenheit)

for i in range(1, 8):   #output celsius for 7 days
    print("Day " + str(i) + " Celsius: " + convertToCelsius(arrayForFahrenheit[i-1]))