import { Injectable } from '@angular/core';

@Injectable()
export class UserService {

  private userLoggedIn: boolean;

  constructor() {
      this.userLoggedIn = true;
  }

  getUserStatus(): boolean {
    return this.userLoggedIn;
  }

}
