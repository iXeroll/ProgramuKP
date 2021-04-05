

def createAdvertisement(name,game,rank,description):
    
    if (name== "" or game== "" or rank== "" or description == ""):
        return "One or more required fields are empty"
    
    result=('Name: {0} Game: {1} Rank: {2} \nDescription: {3} '.format(name,game,rank,description))
    return result

print(createAdvertisement("iXeroll","Valorant","Immortal","Looking for a Comp Lithuanian Team"))