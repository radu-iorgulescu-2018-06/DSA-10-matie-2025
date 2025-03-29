def print_right_angle_triangle(n):
    for i in range(1, n + 1):
        print("*" * i)

# Test the function
n = 5
print_right_angle_triangle(n)


def print_pyramid(n):
    for i in range(1, n + 1):
        # Print spaces
        print(" " * (n - i) + "*" * (2 * i - 1))

# Test the function
n = 5
print_pyramid(n)
