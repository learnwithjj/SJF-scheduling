# SJF-scheduling
Shortest Job First scheduling algorithm is a scheduling process in which process having smaller execution time is chosen for the next execution.

In this algorithm we ignore the different arrival time and use arrival time as 0
First sort the burst time so that we can identify which has shortest jobs 
Then compute completion time :

|  p1  | p2  | p3  | p4  | p5  |
0  -  1  -  3  -  6   -  10  -  17

Turn around time=completion time - arrival time
Waiting time=turn around time - burst time
