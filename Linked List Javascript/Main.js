// Mengimpor LinkedList dari linkedList.js
// const LinkedList = require('./Method');
const LinkedList = require('./Method');

// Membuat instance dari LinkedList
const list = new LinkedList();

// Menambahkan beberapa elemen ke dalam linked list
list.append(1);
list.append({nama: "Abya", Semester: 2});
list.append(3);
list.append("Empat");
list.append("Lima");
list.print(); // Output: 1, 2, 3, Empat, Lima

list.printOf(3);

// Mencetak isi linked list
