import unittest
import Profiles

class testProfile(unittest.TestCase):

    def test_profilesave(self):
         gameProfile = Profiles.gameProfile("Archeage")
         self.assertEqual(gameProfile.selected_game(), "Archeage")

if __name__ == '__main__':
    unittest.main()