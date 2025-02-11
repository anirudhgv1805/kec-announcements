import React from "react";
import {Link} from 'react-router-dom'

export const NavBar : React.FC = () => {

    return(
        <>
            <nav className="bg-blue-500 p-4">
                <div className=" flex justify-between ">
                    <div className="text-lg">
                        KEC ANNOUNCEMENTS
                    </div>
                    <div className="flex space-x-40">
                        <Link to='/'>Home</Link>
                        <Link to='/circulars'>Circulars</Link>
                        <Link to='/calendar'>Calendar</Link>
                        <Link to='/notifications'>Important Notifications</Link>
                    </div>
                    <div className="flex flex-row space-x-2.5">
                        <button className="bg-blue-600 text-white rounded p-0.5 text-blue-700">Login</button>
                        <button className="bg-green-600">SignUp</button>
                    </div>
                </div>
            </nav>
        </>
    );
};