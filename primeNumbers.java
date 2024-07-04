/*A prime number will always have the form 6n+1 or 6n-1. Of course, this equation can produce non-primes as well, 
but if it is a prime it will follow this pattern. Interestingly, it does a pretty good job for the first few n. 
However, it does begin to produce numbers that are not primes, so we should also check that it is not divisible by previous primes.
6*1-1 = 5 (prime)
6*1+1=7 (prime)
6*2-1 = 11(prime)
6*2+1 = 13(prime)
6*3-1=17(prime)
6*3+1=19(prime)
6*4-1=23(prime)
6*4+1=25(not prime)
One quick check is that anything divisible by 2 is not prime except for 2 itself, so we can just check odd numbers only.
Another mathematical shortcut is to realize any divisor will be less than the square root of the number,
so we only have to check up the square root of n, cutting possible checks down even more. 
Summing up everything to check if the number 101 is prime the naive way would be to divide by every possible number
101/2, 101/3, 101/4... So that would be a lot of calculations. Using some of our math facts we can reduce this by 
quite a few checks. We know 101 is not divisible by 2 so it falls in the odds category. We also note the square root
is approximately a little more than 10, so we would only need to check up to 10. Also, we can check even less than 
that by only checking the primes up to 10 so 101/3, 101,5, 101/7 so we reduced our checks quite significantly,
to about 5 total instead of 100. The larger a number is, the more valuable checking less possible n becomes!
Since this code is found on GeeksForGeeks https://www.geeksforgeeks.org/prime-numbers, simply stealing it would be
such a waste of hackerrank problem, I wanted to make sure each step is clear as to what is happening. 

The step that looks the toughest to understand would be the loop:
for (int i = 5; i <= Math.sqrt(n); i = i + 6) 
if (n % i == 0 || n % (i + 2) == 0) return false;

n%i==0 is just making sure each n isn't divisible by i, if it were it wouldn't be prime.
n%(i+2) ==0 threw me off and I am not sure yet I plan to investigate further,
although I suspect it has to do with 6n-1/6n+1 

*/
