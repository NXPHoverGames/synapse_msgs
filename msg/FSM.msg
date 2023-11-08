uint8 MODE_UNKNOWN = 0
uint8 MODE_MANUAL = 1
uint8 MODE_AUTO = 2
uint8 MODE_CMD_VEL = 3

uint8 ARMING_UNKNOWN = 0
uint8 ARMING_DISARMED = 1
uint8 ARMING_ARMED = 2

std_msgs/Header header
uint8 mode
uint8 armed
