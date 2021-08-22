import { Component, OnInit } from '@angular/core';
import { Library } from './library';
import { LibraryService } from './library.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  books: Library[] = [];

  constructor(private libraryService: LibraryService){}
  ngOnInit(){
    this.getBooks();
    this.books = [];
  }

  public getBooks(): void{
    this.libraryService.getBooks().subscribe((response:Library[]) => {

        console.log(response);
        this.books = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

}
