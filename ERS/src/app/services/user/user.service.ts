import { Injectable } from '@angular/core';
import { ERSUser } from '../../models/ersuser';

@Injectable()
export class UserService {

  private userLoggedIn: boolean;

  private users: ERSUser[] = [
    new ERSUser(1, 'Buoysel', 'Otteres', 'buoyott@eso.com', '4787332431', 'Manager', 'sonic260', 'buizel'),
    new ERSUser(2, 'Bo\'Rung', 'Centurious', 'monkinwhite@eso.com', '4657896489', 'Employee', 'bobear28', 'pass'),
    new ERSUser(3, 'Xorug', 'Centurious', 'knightinblack', '4568795618', 'Employee', 'xor32', 'pass')
  ];

  constructor() {
      this.userLoggedIn = false;
  }

  getUserStatus(): boolean {
    return this.userLoggedIn;
  }

  getUsers(): ERSUser[] {
    return this.users;
  }

}
