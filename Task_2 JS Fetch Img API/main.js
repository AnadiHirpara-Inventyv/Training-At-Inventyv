(() => {
    arr1 = [1, 2, 3, 4, 5];
    fe = arr1.shift();
    console.log(fe);
    func2(fe, ...arr1);
})();

function func2(fe, ...args) {
    let arr2 = [6, 7, 8, 9];
    arr2.unshift(fe);
    arr2.push(...arr1);
    console.log(arr2);
    const initialValue = 1;
    const sum = arr2.reduce(
        (accumulator, currentValue) => accumulator + currentValue,
        initialValue,
    );
    console.log(sum);

    let pr = new Promise((resolve, reject) => {
        if (sum > 30) {
            resolve(sum);
        }
         else
          {
            reject("Khota hai bhai");
        }
    });

    pr.then((val) => {
        fetch(`https://api.slingacademy.com/v1/sample-data/photos?limit=${val}`)
            .then((res) => res.json())
            .then((data) => {
                displayImages(data.photos);
                data.photos.map((item)=>{console.log(item.url);});
            });
    }).catch((msg) => {
        console.log(msg);
    });
}

function displayImages(photos) {
    const imageContainer = document.getElementById("image-container");

    photos.forEach((item) => {
        const imgElement = document.createElement("img");
        imgElement.src = item.url;
        imgElement.alt = item.title;
        imageContainer.appendChild(imgElement);
    });
}
