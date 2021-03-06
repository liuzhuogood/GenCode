from setuptools import setup
from gencode.version import VER

with open("./README.md", "r", encoding='utf-8') as fh:
    long_description = fh.read()

setup(
    name='genCode',
    version=VER,
    description='็ๆไปฃ็ ',
    author='hammer',
    author_email='liuzhuogood@foxmail.com',
    long_description=long_description,
    long_description_content_type="text/markdown",
    packages=['gencode'],
    package_data={'gencode': ['README.md', 'LICENSE']},
    install_requires=["rich", 'db-hammer', 'PyMySQL', 'cx_Oracle', 'click', 'jinja2', 'PyYAML'],
    entry_points={
        'console_scripts': [
            'gencode = gencode.main:run'
        ]
    },
)
