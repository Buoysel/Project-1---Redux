export class ERSUser {

    constructor(
        private userID: number,
        private firstName: string,
        private lastName: string,
        private email: string,
        private phoneNumber: string,
        private roleName: string,
        private username: string,
        private password: string,
    ) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.roleName = roleName;
        this.username = username;
        this.password = password;
     }

    getUserID(): number {
        return this.userID;
    }

    getFirstName(): string {
        return this.firstName;
    }

    getLastName(): string {
        return this.lastName;
    }

    getEmail(): string {
        return this.email;
    }

    getPhoneNumber(): string {
        return this.phoneNumber;
    }

    getRoleName(): string {
        return this.roleName;
    }

    getUsername(): string {
        return this.username;
    }
}
