function evenNoToFront(arr) {
    if (arr.length === 0) return 0;
    
    let l = 0;
    let r = arr.length - 1;

    while (l<r) {
        if (arr[l] % 2 === 0) {
            l++;
        }
        else if (arr[r] % 2 !== 0) {
            r--;
        }
        else {
            let temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    return(arr);
    
}

let arr = [4,3,3,5,6,7,8,90,1];
let k = evenNoToFront(arr);
console.log(k);
