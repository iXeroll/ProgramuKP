# test run if they are name starts with test
import unittest
from createFreeAgentAdvertisement import createAdvertisement

class TestAdvertisement(unittest.TestCase):

    def testPositive(self):
       name="iXeroll"
       game="Valorant"
       rank="Immortal"
       description="Looking for a Comp Lithuanian Team"
       expected="Name: iXeroll Game: Valorant Rank: Immortal \nDescription: Looking for a Comp Lithuanian Team "
       self.assertEqual(createAdvertisement(name,game,rank,description),expected)

  #  def testError(self):
  #      name="iXeroll"
  #      game="Valorant"
  #      rank="Immortal"
  #      expected="Name: iXeroll Game: Valorant Rank: Immortal \nDescription: Looking for a Comp Lithuanian Team "
  #      self.assertEqual(createAdvertisement(name,game,rank,description),expected)
    
    def testNegative(self):
        name="iXeroll"
        game="Valorant"
        rank="Immortal"
        description=""
        expected="One or more required fields are empty"
        self.assertEqual(createAdvertisement(name,game,rank,description),expected)

    

unittest.main()
