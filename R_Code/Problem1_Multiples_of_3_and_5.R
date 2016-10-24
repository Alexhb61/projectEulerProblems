nums <- 1:1000
nums[]
sum(which(nums %% 3==0)) + sum(which(nums%%5==0)) 
- sum(which(nums%%15==0))
 #failed
outputSum = 0
for(i in 1:1000){#edit from 1000 to 999
  if(i%%3==0){
    outputSum = i + outputSum
  }else if(i%%5==0){
    outputSum = i + outputSum
  }
}
outputSum#same as the two parter..

which(nums%%3==0)
#wait is it just below 1000, doesn't include 1000 so the anser is the same as the 1st and 3rd try minus 1000
234618-1000
#nope....FUCK Ill do this later.
#try xor next.
outputSum <-0
for(i in 1:999){#edit from 1000 to 999 theirs didn't have 10
  if(i%%3==0 && i%%5!=0){#error, mutiples of 15 and5 changed to !=
    outputSum = i + outputSum
  }else if(i%%5==0){
    outputSum = i + outputSum
  }
}
outputSum
#233168<- was correct. I was consistently getting copy errors.
#wierd answer 99500
# I wish I new R style's guide