import { NgModule, CUSTOM_ELEMENTS_SCHEMA, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import{AdvertismentComponent} from './advertisment/advertisment.component';
import {AccommodationComponent} from './accommodation/accommodation.component';






const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'login', component: LoginComponent },
  {path: 'advertisment', component: AdvertismentComponent},
  {path:'accommodation',component:AccommodationComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppRoutingModule { }
