
for i in range(1, 101):
    # Check if the number is divisible by both 3 and 5
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    # Check if the number is divisible by 3
    elif i % 3 == 0:
        print("Fizz")
    # Check if the number is divisible by 5
    elif i % 5 == 0:
        print("Buzz")
    # Otherwise, print the number itself
    else:
        print(i)
