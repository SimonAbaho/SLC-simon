import unittest
from prime_number import prime_number
class prime_number_test(unittest.TestCase):

def test_prime_number_two(self):        
        self.assertEqual(prime_number(3)[1], [2,3], msg="Result is invalid")
