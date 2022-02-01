    ##### DOEN'T WORK ##### BUT I'LL KEEP IT FOR HISTORY

numbers = "1 2 3 4 5"  # return "5 1"

def high_and_low(numbers):

    numlist = list(numbers.split(" "))
    
    # return numlist.sort(key = int, reverse = True)[0]
    numlist.sort(key = int)

    # return big_num[0] + " " + smol_num[0]

    # print(str(big_num[0]) + " " + str(smol_num[0]))
    # print(str(smol_num))





high_and_low(numbers)