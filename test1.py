import unittest
from prime_number import prime_number
class prime_number_test(unittest.TestCase):

    def test_prime_number_one(self):
        
        self.assertEqual(prime_number(2)[1], [2], msg="Result is invalid")