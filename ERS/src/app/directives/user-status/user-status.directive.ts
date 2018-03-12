import { Directive, OnInit, Input, Output, TemplateRef, ViewContainerRef } from '@angular/core';
import { UserService } from '../../services/user/user.service';

@Directive({
  selector: '[appUserStatus]'
})
/**
 * @description A custom directive for displaying certain elements depending on the user's login status
 *
 * @author Allan Poindexter
 */
export class UserStatusDirective {

  constructor(private userService: UserService,
              private templateRef: TemplateRef<any>,
              private viewContainer: ViewContainerRef) { }

  @Input() set appUserStatus(status: string) {
    if (this.userService.getUserStatus()) {
      this.viewContainer.createEmbeddedView(this.templateRef);
    } else if (!this.userService.getUserStatus()) {
      this.viewContainer.clear();
    }
  }
}
