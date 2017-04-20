def find_missing(a, b):

    if not a and not b:

        return 0

    if not set(a) ^ set(b):

        return 0

    else:

        return list(set(a) ^ set(b))[0]