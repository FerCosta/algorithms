const array = [6, 4, 5, 3, 2, 1];
console.log(array);
for (let i = 0, len = array.length; i < array.length - 1; i++) {
  for (let j = 0; j < len - 1 - i; j++) {
    if (array[j] > array[j+1]) {
      const temp = array[j];
      array[j] = array[j+1];
      array[j+1] = temp;
    }
  }
}
console.log(array);
