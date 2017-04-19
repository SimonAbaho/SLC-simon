def words(astring):
    # empty dictionary
    adict = {}
    # my list is to be split
    alist = astring.split()
    # checking for a word in my list
    for word in alist:

        if word.isdigit():
            word = int(word)

        if word in adict:
            adict[word] = adict[word] + 1
        else:
            adict[word] = 1
    return adict


print(words("test Test this"))
