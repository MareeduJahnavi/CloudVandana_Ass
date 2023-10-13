let s = prompt();  //input reading

let char = s.split(' ');	//splitting the words in a sentence

for(let i=0; i<char.length; i++){
    let word = char[i];
    let string = "";
    for(let j=word.length-1; j>=0; j--){
        string +=word[j];
    }
    char[i] = string;
}
console.log(char.join(' '));