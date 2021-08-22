import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Library } from './library';

@Injectable({
  providedIn: 'root'
})
export class LibraryService {
  private apiServerUrl = "http://localhost:9090/api/all";

  constructor(private http: HttpClient) { }

  public getBooks(): Observable<Library[]>{
    return this.http.get<Library[]>(this.apiServerUrl);
  }
}
