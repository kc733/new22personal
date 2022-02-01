num = 15

def descending_order(num):
    num_list = [int(x) for x in str(num)]
    num_list.sort(reverse = True)

    join_num = [str(x) for x in num_list]
    joining_num = "".join(join_num)
    result = int(joining_num)
    return(result)

descending_order(num)