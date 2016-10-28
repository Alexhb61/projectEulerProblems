#how to calculate primes....
#probably bad algorithm
primes = c(2,3,5,7,11,13)
primes[length(primes)]
n<- 6
while(n<10001){
  pos_prime <- primes[length(primes)]+1
  while(any(pos_prime%%primes ==0)){
    pos_prime<-pos_prime+1#probably bad algorithm but whatever
  }
  n<- n+1
  primes <- c(primes,pos_prime)
}
length(primes)
primes
#testing condition Initial Code:inside inner while loop all(pos_prime %% primes!=0)
14%%primes 
14%%primes!=0
all(14%%primes!=0)#no that would end the if loop unless it were prime
!any(14%%primes!=0)
!all(14%%primes != 0)
#end if all not %% by primes
#continue if any %% by any prime
any(17%%primes==0)#I think correct
