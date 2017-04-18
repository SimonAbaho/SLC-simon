import unittest
from prime_number import prime_number
class prime_number_test(unittest.TestCase):

  def test_arg_is_int(self):
        self.assertIsInstance(prime_number(1)[0], int, msg="Argument is not integer")