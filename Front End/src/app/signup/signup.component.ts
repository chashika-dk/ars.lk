import { Component, OnInit } from '@angular/core';
import {FormControl, Validators} from '@angular/forms';

export interface District {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  district: District[] = [
    { value: 'Matara-0', viewValue: 'Matara' },
    { value: 'Galle-1', viewValue: 'Galle' },
    { value: 'Hambantota-2', viewValue: 'Hambantota' }
  ];
  imageURL: String = "/assets/images/default.png";
  fileToUpload: File = null;
  constructor() { }

  ngOnInit(): void {
  }
  handleFileInput(file: FileList) {
    this.fileToUpload = file.item(0);

    var reader = new FileReader();
    reader.onload = (event: any) => {
      this.imageURL = event.target.result;
      
    }
    reader.readAsDataURL(this.fileToUpload);
  }
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);

}
export class InputErrorsExample {
  emailFormControl = new FormControl('', [
    Validators.required,
    Validators.email,
  ]);
}



