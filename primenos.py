def prime_number(n):
    return [prime for prime in range(2, n + 1) if is_prime(prime) and isinstance(n, int)]


def is_prime(number):
    factors = [num for num in range(1, number + 1) if number % num == 0]
    return len(factors) == 2


print(prime_number(100))