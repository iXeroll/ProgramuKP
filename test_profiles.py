import unittest
import Profiles

class testProfile(unittest.TestCase):

    def test_profilesave_possitive(self):
         gameProfile = Profiles.gameProfile("Archeage")
         self.assertEqual(gameProfile.selected_game(), "Archeage")

    #def test_profilesave_negative(self):
       #  gameProfile = Profiles.gameProfile("Archeage")
        # self.assertEqual(gameProfile.selected_game(), "archeage")

    #def test_profilesave_error(self):
     #    gameProfile = Profiles.gameProfile(gamename)
      #   self.assertEqual(gameProfile.selected_game(), "Archeage")

if __name__ == '__main__':
    unittest.main()