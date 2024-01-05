function genNums(num)
{
    const arr = Array.from(String(num), Number);
    const res = [];
  
    function gen(cur, rem) 
    {
        const genNum = parseInt(cur.join(''), 10);

        if(!isNaN(genNum)) 
            res.push(genNum);
    
        for(let i = 0; i < rem.length; i++) 
        {
            const updCur = [...cur, rem[i]];
            const updRem = [...rem.slice(0, i), ...rem.slice(i + 1)];
            gen(updCur, updRem);
        }
    }
  
    gen([], arr);
    return res;
}


// let n = prompt("Enter your Number:")
// let n=1357;





function isPrime(number) {
    if (number < 2)
        return false;
    
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
            return false;
        }
    }

    return true;
}
  







function generatePascals(stopElement,primeNumbers,matched_elements) {


    let row = [1];
    let found = false;
    
    const outputContainer = document.getElementById('pascaltriangle');
    outputContainer.innerHTML ="";
    outputContainer.innerHTML += `<span>${row}</span><br><br><hr>`;

    // const paragraphElement = document.createElement('p');
    // paragraphElement.textContent = row.join(' ');
    // outputContainer.appendChild(paragraphElement);
    // console.log(row.join(' '));
    
    while (!found) 
    {    
        if (!found) {
            const nextRow = [1];
            outputContainer.innerHTML += `<span style="margin-right: 20px;" class="text-element">1</span> `;


            for (let i = 1; i < row.length; i++) {
                nextRow[i] = row[i - 1] + row[i];
                let x = nextRow[i];

                if(x >= stopElement) {
                    found = true;
                }

                if(primeNumbers.includes(x)) {
                    matched_elements.push(x);
                    outputContainer.innerHTML += `<span style="margin-right: 20px; background-color: white;" class="text-element">${x}</span> `;
                }
                else {
                    outputContainer.innerHTML += `<span style="margin-right: 20px;" class="text-element">${x}</span> `;
                }
            }
            
            nextRow.push(1);
            row = nextRow;
        }
        
        outputContainer.innerHTML += `<span class="text-element">1</span><p></p><hr>`;
    }
  }
  


function processinput(){

    let n=document.getElementById("userInput").value;
    let arr = genNums(n);
    console.log(n);


    let matched_elements = [];
    let missed_elements = [];

    arr = [... new Set(arr)];
    console.log("Generated numbers:", arr);
    
    
    const primeNumbers = arr.filter(isPrime);
    console.log("Prime numbers:", primeNumbers);

    const stopElement = Math.max(...primeNumbers);
    console.log("Largest prime number:", stopElement);
    console.log("=======================================");
    generatePascals(stopElement,primeNumbers,matched_elements);


    matched_elements = [... new Set(matched_elements)];
    console.log("Matched elements:", matched_elements);


    for(let i of primeNumbers) {
        if(!matched_elements.includes(i)) {
            missed_elements.push(i);
        }
    }

    console.log("Missed elements:", missed_elements);


    // Display the information in the browser
    document.getElementById('generatedNumbers').textContent = `Generated Numbers: ${arr.join(', ')}`;
    document.getElementById('primeNumbers').textContent = `Prime Numbers: ${primeNumbers.join(', ')}`;
    document.getElementById('largestPrime').textContent = `Largest Prime Number: ${stopElement}`;
    document.getElementById('matchedElements').textContent = `Matched Elements: ${matched_elements.join(', ')}`;
    document.getElementById('missedElements').textContent = `Missed Elements: ${missed_elements.join(', ')}`;

}