def convertToCelsius(x):    #function convert to celsius
    y = float(x)
    y = (y - 32) * 5 / 9
    return str(round(y, 1))

z=[]
for i in range(1, 8):   #user input fahrenheit for 7 days
    x = input("Day " + str(i) + " Fahrenheit: ")
    z.append(x)

for i in range(1, 8):   #output celsius for 7 days
    print("Day " + str(i) + " Celsius: " + convertToCelsius(z[i-1]))
