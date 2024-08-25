// Node class untuk linked list
class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

// LinkedList class
class LinkedList {
  constructor() {
    this.head = null;
  }

  // Menambahkan node di akhir linked list
  append(data) {
    const newNode = new Node(data);
    if (this.head === null) {
      this.head = newNode;
    } else {
      let current = this.head;
      while (current.next !== null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  printOf(index) {
    // console.log(this.head);
    let cur = this.head
    for (let i = 0; i < index; i++) {
      cur = cur.next;
    }
    console.log( "Data linked list pada index ke " + index + " = " + cur.data);
  }

  // Mencetak isi linked list
  print() {
    let current = this.head;
    while (current !== null) {
      console.log(current.data);
      current = current.next;
    }
  }
}

// Mengekspor kelas LinkedList agar bisa diimpor di file lain
module.exports = LinkedList;
