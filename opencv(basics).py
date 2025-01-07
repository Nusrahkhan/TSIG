import cv2
from cv2 import *
import numpy as np

# displaying image
img = cv2.imread("cat.jpg")

#cv2.imshow("window", img)
#cv2.waitKey(0)

# changing color (making the 2nd channel as 0 i.e green channel)
var = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
print(var.shape)
#img[:: 2] = 0

#cv2.imshow("window", var)
cv2.waitKey(0)

#flipping image
img = cv2.flip(img, -1)
cv2.imshow("window", img)
cv2.waitKey(0)