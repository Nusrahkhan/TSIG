import cv2
from cv2 import *

cap = cv2.VideoCapture(0)

while True:
    ret, frame = cap.read()
    cv2.imshow("webcam", frame)
    if cv2.waitKey(1) & 0xFF == ord('x'):
        break

cv2.destroyAllWindows()