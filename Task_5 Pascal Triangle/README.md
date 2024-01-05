
## Task_5 Aim : Aim: Develop a program that reads a number. Number should be atleast 4 digit long. Generate all possible permutations and combinations of that number and find prime from that. Compare the prime numbers array with Pascal's Triangle and highlight the prime numbers in the Pascal's Triangle. Create an error ratio list and print it. Also create the list of matched elements and missing elements.


Row



## Code

⦾ finding Permutation and  Combintaion


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


⦾ Primecheck function


    
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
            return false;
        }
    }

    return true;


⦾ Generate Pascal Triangle function



      for (let i = 1; i < row.length; i++) {
        nextRow[i] = row[i - 1] + row[i];
        let x = nextRow[i];

        if (x >= stopElement) {
          found = true;
        }

        if (primeNumbers.includes(x)) {
          matched_elements.push(x);
          outputContainer.innerHTML += `<span style="margin-right: 20px; background-color: white;" class="text-element">${x}</span> `;
        } else {
          outputContainer.innerHTML += `<span style="margin-right: 20px;" class="text-element">${x}</span> `;
        }
      }

      nextRow.push(1);
      row = nextRow;
    }

    outputContainer.innerHTML += `<span class="text-element">1</span><p></p><hr>`;

  
## Output
![Screenshot (282)](https://github.com/AnadiHirpara-Inventyv/Training-At-Inventyv/assets/153496016/31ef20c1-84ef-4963-8507-2605f04254f3)



## Authors

- [@AnadiHirpara-Inventyv](https://github.com/AnadiHirpara-Inventyv)


## License

[MIT](https://choosealicense.com/licenses/mit/)

