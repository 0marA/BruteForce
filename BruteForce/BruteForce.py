from ctypes.wintypes import WORD
from string import ascii_lowercase
import time

START_TIME = time.time()
WORD_TO_GUESS = "malding"
word = ""

def main(): 
    for x in WORD_TO_GUESS:
        bruteForce(x)
        time.sleep(.5)
    print("Decoded in: %s" % (time.time() - START_TIME) + " seconds")

def bruteForce(char):
    global word
    for c in ascii_lowercase:
        print(word + c)
        if c == char:
            word += c
            print("Success with " + c)
            return
    for i in range(0, 9): # Even uglier type casting 😭
        print(word + str(i))
        if str(i) == char:
            word += str(i)
            print("Success with " + str(i))
            return

if __name__ == "__main__":
    main()
