import { Component, OnInit } from '@angular/core';
import { LoginUser } from '../../models/loginuser';
import { UserService } from '../../services/user/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginUser: LoginUser = new LoginUser('', '');

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  login() {
    const users = this.userService.getUsers();
    for (let i = 0; i < users.length; i++) {
      console.log(users[i]);
      if (users[i].getUsername() === this.loginUser.username &&
          users[i].getPassword() === this.loginUser.password) {
            this.userService.setUserStatus(true);
            console.log('User found.');
            break;
          }
      else {
        console.log('User not found');
      }
    }
  }

}
