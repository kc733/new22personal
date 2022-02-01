import string
pangram = "The quick, brown fox jumps over the lazy dog!"

def is_pangram(pangram):
    alphabet = set(string.ascii_lowercase)

    if set(pangram.lower()) >= alphabet:
        return True
    else:
        return False

is_pangram(pangram)
