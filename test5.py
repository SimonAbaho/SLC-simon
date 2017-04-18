import unittest
from prime_number import prime_number
class prime_number_test(unittest.TestCase):


def test_prime_number_in_list(self):
        self.assertIsInstance(prime_number(1)[1],list,msg="Result is not in a list")