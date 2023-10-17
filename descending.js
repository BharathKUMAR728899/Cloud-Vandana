
const userInput =prompt();
const array = userInput.split(' ').map(Number);
array.sort(function(a, b) {
  return b - a;
});

console.log(array); 