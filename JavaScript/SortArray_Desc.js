const n = parseInt(prompt());
const arr = [];

for (let i = 0; i < n; i++) {
    const userInput = prompt();
    arr.push(userInput);
}
arr.sort((a, b) => b - a);  // Sorting in descending order
console.log(arr);